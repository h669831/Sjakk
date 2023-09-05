class Queen(color: String, row: Int, col: Int) : ChessPiece("Queen", color, row, col) {
    override fun isValidMove(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>): Boolean {
        val rowDiff = newRow - row
        val colDiff = newCol - col

        // Sjekk gyldige trekk for dronningen basert på dens bevegelsesregler
        if (rowDiff == 0 || colDiff == 0 || Math.abs(rowDiff) == Math.abs(colDiff)) {
            // Dronningen kan bevege seg vertikalt, horisontalt eller diagonalt
            val stepRow = if (rowDiff == 0) 0 else if (rowDiff > 0) 1 else -1
            val stepCol = if (colDiff == 0) 0 else if (colDiff > 0) 1 else -1

            var currentRow = row + stepRow
            var currentCol = col + stepCol

            while (currentRow != newRow || currentCol != newCol) {
                if (board[currentRow][currentCol] != null) {
                    return false // Det er en hindring på veien
                }
                currentRow += stepRow
                currentCol += stepCol
            }

            return board[newRow][newCol] == null || board[newRow][newCol]!!.color != color
        }

        return false // Ugyldig trekk for dronningen
    }
}
