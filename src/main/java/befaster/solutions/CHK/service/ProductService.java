package befaster.solutions.CHK.service;

import befaster.solutions.CHK.model.products.A;
import befaster.solutions.CHK.model.products.B;
import befaster.solutions.CHK.model.products.C;
import befaster.solutions.CHK.model.products.D;
import befaster.solutions.CHK.model.products.E;
import befaster.solutions.CHK.model.products.F;
import befaster.solutions.CHK.model.products.G;
import befaster.solutions.CHK.model.products.H;
import befaster.solutions.CHK.model.products.I;
import befaster.solutions.CHK.model.products.J;
import befaster.solutions.CHK.model.products.K;
import befaster.solutions.CHK.model.products.L;
import befaster.solutions.CHK.model.products.M;
import befaster.solutions.CHK.model.products.N;
import befaster.solutions.CHK.model.products.O;
import befaster.solutions.CHK.model.products.P;
import befaster.solutions.CHK.model.products.Product;
import befaster.solutions.CHK.model.products.Q;
import befaster.solutions.CHK.model.products.R;
import befaster.solutions.CHK.model.products.S;
import befaster.solutions.CHK.model.products.T;
import befaster.solutions.CHK.model.products.U;
import befaster.solutions.CHK.model.products.V;
import befaster.solutions.CHK.model.products.X;
import befaster.solutions.CHK.model.products.Y;
import befaster.solutions.CHK.model.products.Z;

import java.util.HashMap;

public class ProductService {

    private HashMap<Character, Product> products = new HashMap<>();

    public ProductService() {
        init();
    }

    private void init() {
        products.put('A', new A());
        products.put('B', new B());
        products.put('C', new C());
        products.put('D', new D());
        products.put('E', new E());
        products.put('F', new F());
        products.put('G', new G());
        products.put('H', new H());
        products.put('I', new I());
        products.put('J', new J());
        products.put('K', new K());
        products.put('L', new L());
        products.put('M', new M());
        products.put('N', new N());
        products.put('O', new O());
        products.put('P', new P());
        products.put('Q', new Q());
        products.put('R', new R());
        products.put('S', new S());
        products.put('T', new T());
        products.put('U', new U());
        products.put('V', new V());
        products.put('X', new X());
        products.put('Y', new Y());
        products.put('Z', new Z());
    }

    public Product getByCode(Character code) {
        return products.get(code);
    }
}

