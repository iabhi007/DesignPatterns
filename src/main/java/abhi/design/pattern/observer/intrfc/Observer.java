package abhi.design.pattern.observer.intrfc;

/**
 * Standard Observer
 */
public interface Observer {

    /**
     * This is pull based instead of push via Subject,
     * only data required is fetched when needed.
     */
    void updateInformation();
}
