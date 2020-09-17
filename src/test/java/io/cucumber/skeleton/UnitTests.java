package io.cucumber.skeleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class UnitTests {
    @Test
    public void debe_crear_un_nuevo_comercio_afiliado(){
        ComercioBuild comercioBuild = new ComercioBuild();

        Comercio comercio = comercioBuild.withDisccount(10).name("ketal").build();
        assert (comercio.getDescuento()==10);

    }
}
