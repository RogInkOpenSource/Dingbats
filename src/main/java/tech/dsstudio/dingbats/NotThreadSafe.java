package tech.dsstudio.dingbats;

import java.lang.annotation.*;

/**
 * This method is NOT thread safe.
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface NotThreadSafe {
}
