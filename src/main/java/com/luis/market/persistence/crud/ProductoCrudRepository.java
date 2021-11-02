package com.luis.market.persistence.crud;

import com.luis.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Long> {

   // @Query(value="SELECT * FROM productos WHERE id_categoria= ?",nativeQuery = true)
    //List<Producto> getByCategoria(int idCategoria);
    List<Producto> findByIdCategoriaOrderByNombreAsc(Long idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);

}
