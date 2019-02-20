/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class SubmitAction extends BaseActionElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SubmitAction(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.SubmitAction_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SubmitAction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_SubmitAction(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SubmitAction() {
    this(AdaptiveCardObjectModelJNI.new_SubmitAction__SWIG_0(), true);
  }

  public SubmitAction(SubmitAction arg0) {
    this(AdaptiveCardObjectModelJNI.new_SubmitAction__SWIG_1(SubmitAction.getCPtr(arg0), arg0), true);
  }

  public String GetDataJson() {
    return AdaptiveCardObjectModelJNI.SubmitAction_GetDataJson(swigCPtr, this);
  }

  public JsonValue GetDataJsonAsValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.SubmitAction_GetDataJsonAsValue(swigCPtr, this), true);
  }

  public void SetDataJson(JsonValue value) {
    AdaptiveCardObjectModelJNI.SubmitAction_SetDataJson__SWIG_0(swigCPtr, this, JsonValue.getCPtr(value), value);
  }

  public void SetDataJson(String value) {
    AdaptiveCardObjectModelJNI.SubmitAction_SetDataJson__SWIG_1(swigCPtr, this, value);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.SubmitAction_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static SubmitAction dynamic_cast(BaseActionElement baseActionElement) {
    long cPtr = AdaptiveCardObjectModelJNI.SubmitAction_dynamic_cast(BaseActionElement.getCPtr(baseActionElement), baseActionElement);
    return (cPtr == 0) ? null : new SubmitAction(cPtr, true);
  }

}
