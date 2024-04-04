import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
public @interface Cabecalho{


	String instituicao();

	String projeto();

	String dataCriação();

	String criador();

	int revisao() default 1;

}
