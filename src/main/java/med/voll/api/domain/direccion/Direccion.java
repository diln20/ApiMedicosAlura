package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    private String calle;
    private String  complemento;
    private String distrito;
    private String ciudad;
    private String numero;

    public Direccion(DatosDireccion dirrecion) {
        this.calle =dirrecion.calle();
        this.numero=dirrecion.numero();
        this.distrito = dirrecion.distrito();
        this.complemento = dirrecion.complemento();
        this.ciudad = dirrecion.ciudad();
    }

    public Direccion actualizarDatos(DatosDireccion direccion) {
        this.calle =direccion.calle();
        this.numero=direccion.numero();
        this.distrito = direccion.distrito();
        this.complemento = direccion.complemento();
        this.ciudad = direccion.ciudad();
        return this;
    }
}
