package org.chodavarapu.datamill.http;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public interface ServerRequest extends Request {
    ResponseBuilder respond();
}