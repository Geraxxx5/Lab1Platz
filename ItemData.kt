class ItemData(val originalValue: Any?) {

    fun getType():String?{
        when(originalValue){
            is String -> return "cadena"
            is Int -> return "entero"
            is Boolean -> return "booleano"
            else -> return null
        }
    }

    fun getInfo():String?{
        when(originalValue){
            is String -> return "L"+originalValue.length
            is Int -> {
                var response = "M"
                val value = originalValue.toInt()
                if(originalValue.mod(10) == 0){
                    return response+"10"
                }else if(originalValue.mod(5) == 0){
                    return response+"5"
                }else if(originalValue.mod(2) == 0){
                    return response+"2"
                }else{
                    return null
                }
            }
            is Boolean -> if(originalValue.toString().toBoolean()) return "Verdadero" else return "Falso"
            else -> return null
        }
    }
}