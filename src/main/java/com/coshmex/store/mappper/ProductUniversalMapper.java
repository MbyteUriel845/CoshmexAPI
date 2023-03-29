package com.coshmex.store.mappper;

import com.coshmex.store.model.ProductoFacebook;
import com.coshmex.store.model.ProductoSyscom;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductUniversalMapper {
    public List<ProductoFacebook> mapeaCP(List<ProductoSyscom> lista) {
        List<ProductoFacebook> listaResponse = lista.stream().
                map(mapeaPrdSyscomFaceBook ).collect(Collectors.<ProductoFacebook> toList());
        return   listaResponse;
    }
    public ProductoFacebook mapeaCP( ProductoSyscom viaje) {
        return    mapeaPrdSyscomFaceBook.apply(viaje);
    }

    Function<ProductoSyscom, ProductoFacebook> mapeaPrdSyscomFaceBook
            = new Function<ProductoSyscom, ProductoFacebook>() {
        public ProductoFacebook apply(ProductoSyscom t) {
            ProductoFacebook prod = new ProductoFacebook();
            prod.setId( t.getModelo());
                    prod.setTitle(t.getTitulo());
                    prod.setLink(t.getLink_privado());
                    prod.setProduct_type( "GPS" );
                    prod.setCondition("new");
                    prod.setAvailability( "20");
                    prod.setProduct_type(String.valueOf(t.getPrecio_listaUSD() * 20 ));

                    prod.setBrand(t.getMarca());

            return prod;
        }
    };


}
