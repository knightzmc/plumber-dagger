package me.bristermitten.annotationprocessor

import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedAnnotationTypes
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

/**
 * @author Alexander Wood (BristerMitten)
 */
@SupportedAnnotationTypes("")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
class AspectProcessor : AbstractProcessor() {
    override fun process(annotations: MutableSet<out TypeElement>?, roundEnv: RoundEnvironment?): Boolean {
        println(annotations)
        return false
    }
}
