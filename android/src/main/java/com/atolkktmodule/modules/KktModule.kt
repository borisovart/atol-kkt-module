package com.atolkktmodule.modules

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactMethod
import ru.atol.drivers10.fptr.Fptr
import ru.atol.drivers10.fptr.IFptr
import java.lang.Exception
import java.util.*

class KktModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {
  private val fptr: IFptr = Fptr(context)

  override fun getName(): String {
    return "KktModule"
  }

  override fun getConstants(): Map<String, Any> {
    return HashMap()
  }

  @ReactMethod
  fun destroy() {
    return fptr.destroy()
  }

  @ReactMethod
  fun logWrite(p0: String?, p1: Int, p2: String?, promise: Promise) {
    try {
      val result: Int = fptr.logWrite(p0, p1, p2)
      promise.resolve(result)
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun version(promise: Promise) {
    try {
      val version: String = fptr.version()

      promise.resolve(version)
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun setSettings(settings: String, promise: Promise) {
    try {
      val result: Int = fptr.setSettings(settings)
      promise.resolve(result)
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun setSingleSetting(key: String, value: String) {
    fptr.setSingleSetting(key, value)
  }

  @ReactMethod
  fun applySingleSettings(promise: Promise) {
    try {
      val result: Int = fptr.applySingleSettings()
      promise.resolve(result)
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getSettings(promise: Promise) {
    try {
      promise.resolve(fptr.getSettings())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getSingleSetting(key: String, promise: Promise) {
    try {
      promise.resolve(fptr.getSingleSetting(key))
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun errorCode(promise: Promise) {
    try {
      promise.resolve(fptr.errorCode())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun errorDescription(promise: Promise) {
    try {
      promise.resolve(fptr.errorDescription())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun resetError() {
    fptr.resetError()
  }

  @ReactMethod
  fun setParamBoolean(p0: Int, p1: Boolean) {
    fptr.setParam(p0, p1)
  }

  @ReactMethod
  fun setParamInt(p0: Int, p1: Int) {
    fptr.setParam(p0, p1)
  }

  @ReactMethod
  fun setParamLong(p0: Int, p1: Long) {
    fptr.setParam(p0, p1)
  }

  @ReactMethod
  fun setParamString(p0: Int, p1: String) {
    fptr.setParam(p0, p1);
  }

  @ReactMethod
  fun setParamDate(p0: Int, p1: Date?) {
    fptr.setParam(p0, p1);
  }

  @ReactMethod
  fun setNonPrintableParamBoolean(p0: Int, p1: Boolean) {
    fptr.setNonPrintableParam(p0, p1)
  }

  @ReactMethod
  fun setNonPrintableParamInt(p0: Int, p1: Int) {
    fptr.setNonPrintableParam(p0, p1)
  }

  @ReactMethod
  fun setNonPrintableParamLong(p0: Int, p1: Long) {
    fptr.setNonPrintableParam(p0, p1)
  }

  @ReactMethod
  fun setNonPrintableParamString(p0: Int, p1: String?) {
    fptr.setNonPrintableParam(p0, p1)
  }

  @ReactMethod
  fun setNonPrintableParamDate(p0: Int, p1: Date?) {
    fptr.setNonPrintableParam(p0, p1)
  }

  @ReactMethod
  fun setUserParamBoolean(p0: Int, p1: Boolean) {
    fptr.setUserParam(p0, p1)
  }

  @ReactMethod
  fun setUserParamInt(p0: Int, p1: Int) {
    fptr.setUserParam(p0, p1)
  }

  @ReactMethod
  fun setUserParamLong(p0: Int, p1: Long) {
    fptr.setUserParam(p0, p1)
  }

  @ReactMethod
  fun setUserParamString(p0: Int, p1: String?) {
    fptr.setUserParam(p0, p1)
  }

  @ReactMethod
  fun setUserParamDate(p0: Int, p1: Date?) {
    fptr.setUserParam(p0, p1)
  }

  @ReactMethod
  fun utilFormTlv(promise: Promise) {
    try {
      promise.resolve(fptr.utilFormTlv())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun utilFormNomenclature(promise: Promise) {
    try {
      promise.resolve(fptr.utilFormNomenclature())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun utilMapping(promise: Promise) {
    try {
      promise.resolve(fptr.utilMapping())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun readModelFlags(promise: Promise) {
    try {
      promise.resolve(fptr.readModelFlags())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun lineFeed(promise: Promise) {
    try {
      promise.resolve(fptr.lineFeed())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun flashFirmware(promise: Promise) {
    try {
      promise.resolve(fptr.flashFirmware())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun softLockInit(promise: Promise) {
    try {
      promise.resolve(fptr.softLockInit())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun softLockQuerySessionCode(promise: Promise) {
    try {
      promise.resolve(fptr.softLockQuerySessionCode())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun softLockValidate(promise: Promise) {
    try {
      promise.resolve(fptr.softLockValidate())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun utilCalcTax(promise: Promise) {
    try {
      promise.resolve(fptr.utilCalcTax())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun downloadPicture(promise: Promise) {
    try {
      promise.resolve(fptr.downloadPicture())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun bluetoothRemovePairedDevices(promise: Promise) {
    try {
      promise.resolve(fptr.bluetoothRemovePairedDevices())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun utilTagInfo(promise: Promise) {
    try {
      promise.resolve(fptr.utilTagInfo())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun utilContainerVersions(promise: Promise) {
    try {
      promise.resolve(fptr.utilContainerVersions())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun activateLicenses(promise: Promise) {
    try {
      promise.resolve(fptr.activateLicenses())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun removeLicenses(promise: Promise) {
    try {
      promise.resolve(fptr.removeLicenses())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun enterKeys(promise: Promise) {
    try {
      promise.resolve(fptr.enterKeys())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun validateKeys(promise: Promise) {
    try {
      promise.resolve(fptr.validateKeys())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun enterSerialNumber(promise: Promise) {
    try {
      promise.resolve(fptr.enterSerialNumber())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getSerialNumberRequest(promise: Promise) {
    try {
      promise.resolve(fptr.serialNumberRequest)
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun uploadPixelBuffer(promise: Promise) {
    try {
      promise.resolve(fptr.uploadPixelBuffer())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun downloadPixelBuffer(promise: Promise) {
    try {
      promise.resolve(fptr.downloadPixelBuffer())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun printPixelBuffer(promise: Promise) {
    try {
      promise.resolve(fptr.printPixelBuffer())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun utilConvertTagValue(promise: Promise) {
    try {
      promise.resolve(fptr.utilConvertTagValue())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun parseMarkingCode(promise: Promise) {
    try {
      promise.resolve(fptr.parseMarkingCode())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun callScript(promise: Promise) {
    try {
      promise.resolve(fptr.callScript())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun setHeaderLines(promise: Promise) {
    try {
      promise.resolve(fptr.setHeaderLines())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun setFooterLines(promise: Promise) {
    try {
      promise.resolve(fptr.setFooterLines())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun uploadPictureCliche(promise: Promise) {
    try {
      promise.resolve(fptr.uploadPictureCliche())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun uploadPictureMemory(promise: Promise) {
    try {
      promise.resolve(fptr.uploadPictureMemory())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun uploadPixelBufferCliche(promise: Promise) {
    try {
      promise.resolve(fptr.uploadPixelBufferCliche())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun uploadPixelBufferMemory(promise: Promise) {
    try {
      promise.resolve(fptr.uploadPixelBufferMemory())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun execDriverScript(promise: Promise) {
    try {
      promise.resolve(fptr.execDriverScript())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun uploadDriverScript(promise: Promise) {
    try {
      promise.resolve(fptr.uploadDriverScript())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun execDriverScriptById(promise: Promise) {
    try {
      promise.resolve(fptr.execDriverScriptById())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun writeUniversalCountersSettings(promise: Promise) {
    try {
      promise.resolve(fptr.writeUniversalCountersSettings())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun readUniversalCountersSettings(promise: Promise) {
    try {
      promise.resolve(fptr.readUniversalCountersSettings())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun queryUniversalCountersState(promise: Promise) {
    try {
      promise.resolve(fptr.queryUniversalCountersState())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun resetUniversalCounters(promise: Promise) {
    try {
      promise.resolve(fptr.resetUniversalCounters())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun cacheUniversalCounters(promise: Promise) {
    try {
      promise.resolve(fptr.cacheUniversalCounters())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun readUniversalCounterSum(promise: Promise) {
    try {
      promise.resolve(fptr.readUniversalCounterSum())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun readUniversalCounterQuantity(promise: Promise) {
    try {
      promise.resolve(fptr.readUniversalCounterQuantity())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun clearUniversalCountersCache(promise: Promise) {
    try {
      promise.resolve(fptr.clearUniversalCountersCache())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun disableOfdChannel(promise: Promise) {
    try {
      promise.resolve(fptr.disableOfdChannel())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun enableOfdChannel(promise: Promise) {
    try {
      promise.resolve(fptr.enableOfdChannel())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun validateJson(promise: Promise) {
    try {
      promise.resolve(fptr.validateJson())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun reflectionCall(promise: Promise) {
    try {
      promise.resolve(fptr.reflectionCall())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getRemoteServerInfo(promise: Promise) {
    try {
      promise.resolve(fptr.getRemoteServerInfo())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getParamByteArray(value: Int, promise: Promise) {
    try {
      promise.resolve(fptr.getParamByteArray(value))
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getParamInt(key: Int, promise: Promise) {
    try {
      promise.resolve(fptr.getParamInt(key))
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getParamString(key: Int, promise: Promise) {
    try {
      promise.resolve(fptr.getParamString(key))
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getParamDouble(key: Int, promise: Promise) {
    try {
      promise.resolve(fptr.getParamDouble(key))
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getParamBool(key: Int, promise: Promise) {
    try {
      promise.resolve(fptr.getParamBool(key))
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun getParamDateTime(key: Int, promise: Promise) {
    try {
      promise.resolve(fptr.getParamDateTime(key))
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun printText(promise: Promise) {
    try {
      promise.resolve(fptr.printText())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun printCliche(promise: Promise) {
    try {
      promise.resolve(fptr.printCliche())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun beginNonfiscalDocument(promise: Promise) {
    try {
      promise.resolve(fptr.beginNonfiscalDocument())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun endNonfiscalDocument(promise: Promise) {
    try {
      promise.resolve(fptr.endNonfiscalDocument())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun printBarcode(promise: Promise) {
    try {
      promise.resolve(fptr.printBarcode())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun printPicture(promise: Promise) {
    try {
      promise.resolve(fptr.printPicture())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun printPictureByNumber(promise: Promise) {
    try {
      promise.resolve(fptr.printPictureByNumber())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun uploadPictureFromFile(promise: Promise) {
    try {
      promise.resolve(fptr.uploadPictureFromFile())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun clearPictures(promise: Promise) {
    try {
      promise.resolve(fptr.clearPictures())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun writeDeviceSettingRaw(promise: Promise) {
    try {
      promise.resolve(fptr.writeDeviceSettingRaw())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun readDeviceSettingRaw(promise: Promise) {
    try {
      promise.resolve(fptr.readDeviceSettingRaw())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun commitSettings(promise: Promise) {
    try {
      promise.resolve(fptr.commitSettings())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun initSettings(promise: Promise) {
    try {
      promise.resolve(fptr.initSettings())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun resetSettings(promise: Promise) {
    try {
      promise.resolve(fptr.resetSettings())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun writeDateTime(promise: Promise) {
    try {
      promise.resolve(fptr.writeDateTime())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun writeLicense(promise: Promise) {
    try {
      promise.resolve(fptr.writeLicense())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun fnOperation(promise: Promise) {
    try {
      promise.resolve(fptr.fnOperation())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun fnQueryData(promise: Promise) {
    try {
      promise.resolve(fptr.fnQueryData())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun fnWriteAttributes(promise: Promise) {
    try {
      promise.resolve(fptr.fnWriteAttributes())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun externalDevicePowerOn(promise: Promise) {
    try {
      promise.resolve(fptr.externalDevicePowerOn())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun externalDevicePowerOff(promise: Promise) {
    try {
      promise.resolve(fptr.externalDevicePowerOff())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun externalDeviceWriteData(promise: Promise) {
    try {
      promise.resolve(fptr.externalDeviceWriteData())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun externalDeviceReadData(promise: Promise) {
    try {
      promise.resolve(fptr.externalDeviceReadData())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun operatorLogin(promise: Promise) {
    try {
      promise.resolve(fptr.operatorLogin())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun processJson(promise: Promise) {
    try {
      promise.resolve(fptr.processJson())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun readDeviceSetting(promise: Promise) {
    try {
      promise.resolve(fptr.readDeviceSetting())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun writeDeviceSetting(promise: Promise) {
    try {
      promise.resolve(fptr.writeDeviceSetting())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun beginReadRecords(promise: Promise) {
    try {
      promise.resolve(fptr.beginReadRecords())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun readNextRecord(promise: Promise) {
    try {
      promise.resolve(fptr.readNextRecord())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun endReadRecords(promise: Promise) {
    try {
      promise.resolve(fptr.endReadRecords())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun userMemoryOperation(promise: Promise) {
    try {
      promise.resolve(fptr.userMemoryOperation())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun continuePrint(promise: Promise) {
    try {
      promise.resolve(fptr.continuePrint())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun initMgm(promise: Promise) {
    try {
      promise.resolve(fptr.initMgm())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun open(promise: Promise) {
    try {
      promise.resolve(fptr.open())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun isOpened(promise: Promise) {
    try {
      promise.resolve(fptr.isOpened)
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun close(promise: Promise) {
    try {
      promise.resolve(fptr.close())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun resetParams(promise: Promise) {
    try {
      promise.resolve(fptr.resetParams())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun runCommand(promise: Promise) {
    try {
      promise.resolve(fptr.runCommand())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun beep(promise: Promise) {
    try {
      promise.resolve(fptr.beep())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun openDrawer(promise: Promise) {
    try {
      promise.resolve(fptr.openDrawer())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun cut(promise: Promise) {
    try {
      promise.resolve(fptr.cut())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun devicePoweroff(promise: Promise) {
    try {
      promise.resolve(fptr.devicePoweroff())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun deviceReboot(promise: Promise) {
    try {
      promise.resolve(fptr.deviceReboot())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun openShift(promise: Promise) {
    try {
      promise.resolve(fptr.openShift())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun resetSummary(promise: Promise) {
    try {
      promise.resolve(fptr.resetSummary())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun initDevice(promise: Promise) {
    try {
      promise.resolve(fptr.initDevice())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun queryData(promise: Promise) {
    try {
      promise.resolve(fptr.queryData())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun cashIncome(promise: Promise) {
    try {
      promise.resolve(fptr.cashIncome())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun cashOutcome(promise: Promise) {
    try {
      promise.resolve(fptr.cashOutcome())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun openReceipt(promise: Promise) {
    try {
      promise.resolve(fptr.openReceipt())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun cancelReceipt(promise: Promise) {
    try {
      promise.resolve(fptr.cancelReceipt())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun closeReceipt(promise: Promise) {
    try {
      promise.resolve(fptr.closeReceipt())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun checkDocumentClosed(promise: Promise) {
    try {
      promise.resolve(fptr.checkDocumentClosed())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun receiptTotal(promise: Promise) {
    try {
      promise.resolve(fptr.receiptTotal())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun receiptTax(promise: Promise) {
    try {
      promise.resolve(fptr.receiptTax())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun registration(promise: Promise) {
    try {
      promise.resolve(fptr.registration())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun payment(promise: Promise) {
    try {
      promise.resolve(fptr.payment())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }

  @ReactMethod
  fun report(promise: Promise) {
    try {
      promise.resolve(fptr.report())
    } catch (e: Exception) {
      promise.reject("Error", e)
    }
  }
}
