package task_5.annotation;

import java.lang.annotation.*;

@Repeatable(ThisCodeSmellsContainer.class)
@Target(value = {ElementType.MODULE, ElementType.PACKAGE, ElementType.TYPE, ElementType.FIELD,
        ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.METHOD,
        ElementType.ANNOTATION_TYPE, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ThisCodeSmells {
    String reviewer();
}
