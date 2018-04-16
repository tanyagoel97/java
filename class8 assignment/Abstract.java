
package pkgabstract;


public class Abstract {

    
    public static void main(String[] args) {
        bear b=new bear();
        camel c=new camel();
        System.out.println(b.name);
        b.speak();
        b.eat();
        System.out.println(c.name);
        c.eat();
        c.speak();
        
    }
    
}
