package basics;

import java.util.stream.Stream;

public class DataProvider {
    
    public static Stream<Object[]> dataProviderForAdd(){
        return Stream.of(
            new Object[]{1,2,3},
            new Object[]{1,2,3},
            new Object[]{1,2,3},
            new Object[]{1,2,3}
        );
    }
}
