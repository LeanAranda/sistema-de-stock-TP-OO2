package com.unla.tpGrupo4.services.implementation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.unla.tpGrupo4.entities.Compra;
import com.unla.tpGrupo4.entities.Producto;
import com.unla.tpGrupo4.entities.User;
import com.unla.tpGrupo4.repositories.ICompraRepository;
import com.unla.tpGrupo4.repositories.IUserRepository;

@Service("CompraService")
public class CompraService implements ICompraService{
	@Autowired
    private ICompraRepository compraRepository;
	
	@Autowired
    private IProductoService productoService;
	
	@Autowired
    private IUserRepository userRepository;
   
    public CompraService(ICompraRepository compraRepository) {
        this.compraRepository = compraRepository;
        
    }
    
   public List<Compra> verCompras() {
        return compraRepository.findAll();
    }
   
    
    public void crearCompra(Compra m, int id) {
    	
    	//producto comprado
    	Producto p = productoService.buscarProducto(id);
    	
    	//cliente
    	String username = SecurityContextHolder.getContext().getAuthentication().getName();
 		User u = userRepository.findByUsernameAndFetchUserRolesEagerly(username);
    	
    	m.setFecha(LocalDateTime.now());
    	m.setPrecioFinal( p.getPrecio() * m.getCantidad());
    	m.setProducto(p);
    	m.setUser(u);
    	
        compraRepository.save(m);
        
        //TODO q al comprar baje el stock del producto
        p.setStock(p.getStock() - m.getCantidad());
        productoService.insertOrUpdate(p);

    }
   
    public void borrarCompra(int id) {
        compraRepository.deleteById(id);
    }

  
    public Compra buscarCompra(int id) {
        
        return compraRepository.findById(id).orElse(null);
    }

   
    public void modificarCompra(int id, Compra compra) {
        
    }
    
    public List<Compra> findCompras(){
    	return compraRepository.findCompras();
    }
	
}
