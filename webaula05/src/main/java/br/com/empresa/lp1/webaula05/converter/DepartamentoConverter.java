package br.com.empresa.lp1.webaula05.converter;

import br.com.empresa.lp1.webaula05.model.Departamento;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.springframework.stereotype.Component;

@Component
public class DepartamentoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        Departamento departamento = new Departamento();
        departamento.setId(Integer.parseInt(string));
        return departamento;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        return "" + ((Departamento) t).getId();
    }

}
