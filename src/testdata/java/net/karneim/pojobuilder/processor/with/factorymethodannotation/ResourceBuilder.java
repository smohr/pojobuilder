package net.karneim.pojobuilder.processor.with.factorymethodannotation;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class ResourceBuilder
    implements Cloneable {
  protected ResourceBuilder self;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected String value$content$java$lang$String;
  protected boolean isSet$content$java$lang$String;

  /**
   * Creates a new {@link ResourceBuilder}.
   */
  public ResourceBuilder() {
    self = (ResourceBuilder)this;
  }

  /**
   * Sets the default value for the {@link Resource#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ResourceBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Resource#content} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ResourceBuilder withContent(String value) {
    this.value$content$java$lang$String = value;
    this.isSet$content$java$lang$String = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      ResourceBuilder result = (ResourceBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public ResourceBuilder but() {
    return (ResourceBuilder)clone();
  }

  /**
   * Creates a new {@link Resource} based on this builder's settings.
   *
   * @return the created Resource
   */
  public Resource build() {
    try {
      Resource result = ResourceFactory.makeResource(value$name$java$lang$String, value$content$java$lang$String);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
