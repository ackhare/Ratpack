/**
 * Created by chetan on 3/10/16.
 */


import static ratpack.groovy.Groovy.*

ratpack {
    handlers {
        get {
            render "Hello world!"
        }
    }
}
