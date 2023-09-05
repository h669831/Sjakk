abstract class ChessPiece(val name: String, val color: String, var row: Int, var col: Int) {
    abstract fun isValidMove(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>): Boolean

    fun move(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>) {
        if (isValidMove(newRow, newCol, board)) {
            board[newRow][newCol] = this
            board[row][col] = null
            row = newRow
            col = newCol
        } else {
            println("Ugyldig trekk!")
        }
    }
}