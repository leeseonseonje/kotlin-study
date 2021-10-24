package kotlinstudy.kotlin.domain

/**
 * 디컴파일한 자바 코드에서 필드가 private이라고 하여 코틀린의 프로퍼티도 private은 아니다.
 * 자바는 기본적으로 필드로 다루고, 코틀린은 프로퍼티(필드 + 접근자)를 기본으로 다루는 언어다.
 */
class KotlinProperty {
    
    var name: String = ""
    /**
     * 위의 코드는 아래의 자바코드가 된다.

    public class Person {
    private String name;

    public Person(String name) {
    this.name = name;
    }

    public Void setName(String value) {
    this.name = value;
    }

    public String getName() {
    return this.name;
    }

    자바 필드인 name자체만 보면 private 키워드가 붙어있으므로 private이 맞지만,
    프로퍼티 전체를 보면 다르다.
    필드는 private이지만 getter와 setter로 접근이 모두 가능하기 때문에 프로퍼티는 private하다고 볼 수 없다.
     */
}

class KotlinPrivateProperty {
    /**
     * 위의 KotlinProperty에서 name 프로퍼티가 private이기 위해서는 아래와 같은 코틀린 코드가 필요하다.
     */

    private var name: String = ""

    /**
     *  name 앞에 private이 붙었다.
    private이 붙지 않은 상태였어도 디컴파일한 자바 코드의 필드에는 private이 붙지만,
    코틀린은 기본적으로 필드가 아닌 프로퍼티를 다루기 때문에 프로퍼티 전체가 private이 된다.
    디컴파일된 자바 코드는 아래와 같다.

    public final class Property {
    private String name;

    public Property(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull(name, "name");
    super();
    this.name = name;
    }
    }
    getter와 setter가 없어서 프로퍼티가 private이라고 볼 수 있다.
     */
}
/**
 * 핵심
    자바는 필드를 기본으로, 코틀린은 프로퍼티를 기본으로 다룬다.
    디컴파일된 자바 코드의 필드가 private이라고해서 kotlin 프로퍼티가 private인 것은 아니다.
 */