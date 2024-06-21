import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Test // Marks the annotation as a test annotation
@Timeout(2) // Sets the timeout value for the annotated method
public @interface HasharaAnn {
}
