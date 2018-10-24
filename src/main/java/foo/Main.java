package foo;

import io.micronaut.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ApplicationContext applicationContext = ApplicationContext.run()) {
            Foo foo = applicationContext.getBean(Foo.class);
            foo.doIt(0);
        }
    }
}
