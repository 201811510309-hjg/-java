package D03_核心类库_02常用类库.敲敲敲.kkb;

import java.util.Objects;

public class D3_Person {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D3_Person d3_demo = (D3_Person) o;
        return Objects.equals(name, d3_demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
