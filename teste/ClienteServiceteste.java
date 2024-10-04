import dao.ClienteDaoMock;
import dao.IClienteDao;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteSevice;

public class ClienteServiceteste {
    @Test
    public void salvarTest(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteSevice sevice = new ClienteSevice();
        String retorno = sevice.salva();
        Assert.assertEquals("Sucesso",retorno);
    }
}



