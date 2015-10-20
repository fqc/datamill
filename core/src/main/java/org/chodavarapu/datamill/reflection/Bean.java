package org.chodavarapu.datamill.reflection;

import org.chodavarapu.datamill.values.Value;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public interface Bean<T> {
    <P> Bean<T> set(P property, Value value);
    <P> Bean<T> set(P property, P value);
    <P> P get(P property);
    T unwrap();
}