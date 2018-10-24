package foo;

import javax.inject.Singleton;
import javax.validation.constraints.Min;

import io.micronaut.validation.Validated;

@Singleton
@Validated
public class Foo {
    public void doIt(@Min(1) int x) {
        System.out.println("foo.Foo::doIt() called with x = " + x);
    }
}
