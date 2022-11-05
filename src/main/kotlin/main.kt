package ru.netology

fun main() {
    val timeLastVisit = 10_000

    println("был(а) " + agoToText(timeLastVisit))
}

fun agoToText(timeLastVisit: Int): String {

    return when {
        timeLastVisit <= 60 -> "только что"
        timeLastVisit in 61..(60 * 60) -> "${timeLastVisit / 60}" + minuteAgo(timeLastVisit / 60) + " назад"
        timeLastVisit in (60 * 60 + 1)..(24 * 60 * 60) -> "${timeLastVisit / 3600}" + hoursAgo(timeLastVisit / 3600) + " назад"
        timeLastVisit in (24 * 60 * 60 + 1)..(24 * 60 * 60 * 2) -> "вчера"
        timeLastVisit in (24 * 60 * 60 * 2 + 1)..(24 * 60 * 60 * 3) -> "позавчера"
        else -> "давно"
    }
}

fun minuteAgo(minuteToText: Int): String {
    return when (minuteToText) {
        1, 21, 31, 41, 51 -> return " минуту"
        2, 3, 4 -> return " минуты"
        else -> return " минут"
    }
}

fun hoursAgo(hoursToText: Int): String {
    return when (hoursToText) {
        1, 21 -> return " час"
        2, 3, 4 -> return " часа"
        else -> return " часов"
    }
}