package tech.dsstudio.dingbats;

import java.lang.annotation.*;

/**
 * Even you can see this method or member,
 * it is not encouraged to call this method or
 * access this member outside of the library.
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface Concealed {
}
