package Procesos;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.panache.common.Page;

@ApplicationScoped
public class ProcesosRepository implements PanacheRepository<Procesos> {

    public PanacheQuery<Procesos> findPage(int page) {
        Page p = new Page(page - 1, 10);
        var query = findAll();
        query.page(p);
        return query;
    }
}
