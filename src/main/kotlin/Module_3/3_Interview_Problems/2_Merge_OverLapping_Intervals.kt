/*
Given a collection of intervals, merge all overlapping intervals.

[1,3],[2,6],[8,10],[15,18]
[1,6],[8,10],[15,18]

Merge intervals [1,3] and [2,6] -> [1,6].
so, the required answer after merging is [1,6],[8,10],[15,18].
No more overlapping intervals present.
*/


fun main() {
    var interval = ArrayList<Interval>()
    var str =
        "30 63 66 94 36 87 16 86 26 85 24 50 17 84 5 25 67 81 23 54 84 99 48 85 23 28 3 86 63 79 18 73 6 68 34 40 61 66 60 96 95 99 1 10 4 82 19 78 23 61 30 45 53 87 10 42 80 93 33 73 64 65 29 71 73 89 2 98 62 67 84 98 43 58 20 45 86 92 22 100 72 74 5 52 48 56 69 93 8 98 37 47 19 45 22 99 34 97 21 80 58 77 48 66 59 91 18 33 2 7 8 92 12 32 17 83 11 16 60 75 9 11 3 61 4 18 53 68 17 39 18 93 15 55 4 34 48 85 61 65 59 77 15 37 62 82 4 78 80 96 4 42 15 48 27 45"
            .split(" ")

    var i = 0
    while (i <= str.lastIndex) {
        interval.add(Interval(str[i].toInt(), str[i + 1].toInt()))
        i += 2
    }
    MergeOverlappingIntervals().merge(interval)
}

class MergeOverlappingIntervals {
    fun merge(intervals: ArrayList<Interval>): ArrayList<Interval> {
        // Write your code here.
        var intervals = intervals.sortedWith(CompareInterval())
        var result = ArrayList<Interval>()
        result.add(intervals[0])
        var i = 1
        var j = 0

        while (i <= intervals.lastIndex) {
            if (intervals[i].start <= result[j].end) {
                result[j].start = Math.min(result[j].start, intervals[i].start)
                result[j].end = Math.max(result[j].end, intervals[i].end)
            } else if (intervals[i].start > result[j].end) {
                result.add(intervals[i])
                j++
            }
            i++
        }

        return result
    }
}

class CompareInterval : Comparator<Interval> {
    override fun compare(a: Interval, b: Interval): Int {
        return a.start - b.start
    }
}
