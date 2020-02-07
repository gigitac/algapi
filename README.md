# algapi
**A**dvanced **L**ogic **G**ates **API**
gigitac#8656

The ALGAPI is a relatively clean and simple logic gates API meant to save you the hassle of actually making them!
Who **doesn't** want to save themselves 10 lines of code?
**Hell yeah!**

**OR Gates Example**
To make this work, we're going to use a simple Example script.
```
public class Example {
    public static void main(String[] args) {
        boolean alpha = false;
        boolean beta = true;
        boolean given;
        if(given){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
```
Example.java has three booleans, ``alpha`` and ``beta``, and ``given``. ``given`` is going to be what we get from our API,
and depending on ``given``, the text will either read ``True`` or ``False`` accordingly.
Let's use a XNOR gate.
