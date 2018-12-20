package io.anuke.arc.utils;

/**
 * Interface for disposable resources.
 * @author mzechner
 */
public interface Disposable{
    /** Releases all resources of this object. */
    void dispose();
}
