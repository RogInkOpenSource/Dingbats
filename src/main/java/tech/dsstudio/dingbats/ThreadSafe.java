package tech.dsstudio.dingbats;

import java.lang.annotation.*;

/**
 * This method is thread safe.
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface ThreadSafe {
}
