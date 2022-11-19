package bridge.util

import java.lang.IllegalArgumentException

object Exceptions {

    // 3 ~ 20 숫자 범위 확인
    fun checkInputBrideSize(number: String) {
        checkConvertToNumber(number)
        if (number.toInt() !in RANGE_START..RANGE_END) {
            throw IllegalArgumentException(ERROR_HEADER + ERROR_BRIDGE_RANGE)
        }
    }

    // 숫자가 아닌 문자 확인
    private fun checkConvertToNumber(number: String) {
        try {
            number.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException(ERROR_HEADER + ERROR_NUMBER_FORMAT)
        }
    }
}