fun main(args: Array<String>) {
    println("Hello World!")

    var sol = Solution().solve(intArrayOf(2, 4, 7))
    println(sol.joinToString(","))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}