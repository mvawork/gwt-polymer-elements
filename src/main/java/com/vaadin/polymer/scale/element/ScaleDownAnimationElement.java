/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from neon-animation project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.scale.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>&lt;scale-down-animation&gt;</code> animates the scale transform of an element from 1 to 0. By default it<br>scales in both the x and y axes.</p>
 * <p>Configuration:</p>
 * <pre><code>{
 *   name: &#39;scale-down-animation&#39;,
 *   node: &lt;node&gt;,
 *   axis: &#39;x&#39; | &#39;y&#39; | &#39;&#39;,
 *   transformOrigin: &lt;transform-origin&gt;,
 *   timing: &lt;animation-timing&gt;
 * }
 * </code></pre>
 */
@JsType
public interface ScaleDownAnimationElement extends HTMLElement {

    public static final String TAG = "scale-down-animation";
    public static final String SRC = "neon-animation/neon-animation.html";


    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getAnimationTiming();
    /**
     * <p>Defines the animation timing.</p>
     *
     * JavaScript Info:
     * @property animationTiming
     * @type Object
     * 
     */
    @JsProperty void setAnimationTiming(JavaScriptObject value);
  
    /**
     * <p>Called when the animation finishes.</p>
     *
     * JavaScript Info:
     * @method complete
     * 
     */
    void complete();

    /**
     * <p>Sets <code>transform</code> and <code>transformOrigin</code> properties along with the prefixed versions.</p>
     *
     * JavaScript Info:
     * @method setPrefixedProperty
     * @param {} node  
     * @param {} property  
     * @param {} value  
     * 
     */
    void setPrefixedProperty(JavaScriptObject node, JavaScriptObject property, JavaScriptObject value);

    /**
     * <p>Returns the animation timing by mixing in properties from <code>config</code> to the defaults defined<br>by the animation.</p>
     *
     * JavaScript Info:
     * @method timingFromConfig
     * @param {} config  
     * 
     */
    void timingFromConfig(JavaScriptObject config);

    /**
     * 
     *
     * JavaScript Info:
     * @method configure
     * @param {} config  
     * 
     */
    void configure(JavaScriptObject config);

    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * 
     */
    void registered();

}