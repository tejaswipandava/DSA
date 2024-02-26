class Interval(var start: Int, var end: Int) {
    constructor() : this(0, 0)
}

fun main() {

    var interval = ArrayList<Interval>()

    var str =
        "6037774 6198243 6726550 7004541 8842554 10866536 11027721 11341296 11972532 14746848 16374805 16706396 17557262 20518214 22139780 22379559 27212352 28404611 28921768 29621583 29823256 32060921 33950165 36418956 37225039 37785557 40087908 41184444 41922814 45297414 48142402 48244133 48622983 50443163 50898369 55612831 57030757 58120901 59772759 59943999 61141939 64859907 65277782 65296274 67497842 68386607 70414085 73339545 73896106 75605861 79672668 84539434 84821550 86558001 91116470 92198054 96147808 98979097".split(
            " "
        )
    var i = 0
    while (i <= str.lastIndex) {
        interval.add(Interval(str[i].toInt(), str[i + 1].toInt()))
        i = i + 2
    }


    MergeInterval().insert(interval, Interval(36210193, 61984219))
}

class MergeInterval {
    fun insert(intervals: ArrayList<Interval>, newInterval: Interval): ArrayList<Interval> {
        // Write your code here.
        var result = ArrayList<Interval>()

        for (i in 0..intervals.lastIndex) {
            if (intervals[i].end < newInterval.start) result.add(intervals[i])
            else if (intervals[i].start > newInterval.end) {
                result.add(newInterval)
                for (j in i..intervals.lastIndex) {
                    result.add(intervals[j])
                }
                return result
            } else {
                newInterval.start = Math.min(intervals[i].start, newInterval.start)
                newInterval.end = Math.max(intervals[i].end, newInterval.end)
            }
        }

        result.add(newInterval)

        return result
    }

    fun bruteForce(intervals: ArrayList<Interval>, newInterval: Interval): ArrayList<Interval> {
        // Write your code here.
        var result = ArrayList<Interval>()
        var ans = ArrayList<Interval>()
        var flag = false

        for (i in intervals) {
            if (i.end < newInterval.start) result.add(i)
            else if (i.start > newInterval.end) {
                result.add(i)
            } else {
                newInterval.start = Math.min(i.start, newInterval.start)
                newInterval.end = Math.max(i.end, newInterval.end)
            }
        }

        for (i in result) {
            if (i.end <= newInterval.start) ans.add(i)
            else if (i.start >= newInterval.end) {
                if (!flag) {
                    ans.add(newInterval)
                    flag = true
                }
                ans.add(i)
            }
        }

        if (!flag) ans.add(newInterval)

        return ans
    }
}