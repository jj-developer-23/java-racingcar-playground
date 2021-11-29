package study;

public interface ExceptionSupplier<T>{
    T get() throws Exception;


}
