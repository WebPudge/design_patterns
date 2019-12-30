package twenty_two;

/** Prototype Class **/
public class Cookie implements Cloneable {
    public Object clone() throws  CloneNotSupportedException{
        return  (Cookie) super.clone();
    }
}
