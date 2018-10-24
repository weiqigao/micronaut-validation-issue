module validation.issue {
    exports foo;
    opens foo to io.micronaut.inject;

    requires io.micronaut.inject;
    requires io.micronaut.validation;
    requires java.validation;
    requires javax.inject;
}
