package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IObjetivoDao;
import pe.edu.upc.entity.ObjetivoNutricional;

public class ObjetivoDaoImpl implements IObjetivoDao, Serializable {
    private static final long serialVersionUID = 1L;

    @PersistenceContext(unitName = "a")
    private EntityManager em;

    @Transactional
    @Override
    public void inicializar() {

        ObjetivoNutricional bajarPeso = new ObjetivoNutricional();
        bajarPeso.setObjetivoNutricional("Bajar de peso");

        ObjetivoNutricional aumentarMasa = new ObjetivoNutricional();
        aumentarMasa.setObjetivoNutricional("Aumentar masa corporal");

        ObjetivoNutricional mejorarSalud = new ObjetivoNutricional();
        mejorarSalud.setObjetivoNutricional("Mejorar mi salud");

        try {
            em.persist(bajarPeso);
            em.persist(aumentarMasa);
            em.persist(mejorarSalud);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
