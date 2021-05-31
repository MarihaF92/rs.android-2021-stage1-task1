package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.size < 3) return sadArray

        val tempList = sadArray.toMutableList()

        var i = 1
        while (true) {

            if (tempList[i] > tempList[i - 1] + tempList[i + 1]){
                tempList.removeAt(i)
                i = 1
            }
            else {
                i++
            }
            if (i == tempList.size - 1) break
        }

        return tempList.toIntArray()

    }

}
