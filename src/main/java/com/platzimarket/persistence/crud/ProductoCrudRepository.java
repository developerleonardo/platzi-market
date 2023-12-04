package com.platzimarket.persistence.crud;

import com.platzimarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> FindByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    //List<Producto> FindByIdProductoOrderByPrecioVentaAsc(int idProducto);
}
