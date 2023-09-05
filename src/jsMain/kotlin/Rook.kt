class Rook(color: String, row: Int, col: Int) : ChessPiece("Rook", color, row, col) {
    override fun isValidMove(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>): Boolean {
        val rowDiff = newRow - row
        val colDiff = newCol - col

        // Sjekk gyldige trekk for tårnet basert på dens bevegelsesregler
        if (rowDiff == 0 && colDiff != 0) {
            // Sjekk om det er hindringer mellom tårnet og målruten i kolonnen
            val step = if (colDiff > 0) 1 else -1
            var currentCol = col + step
            while (currentCol != newCol) {
                if (board[row][currentCol] != null) {
                    return false // Det er en hindring på veien
                }
                currentCol += step
            }
            // Målruten er enten tom eller inneholder en motstanders brikke
            return board[newRow][newCol] == null || board[newRow][newCol]!!.color != color
        } else if (rowDiff != 0 && colDiff == 0) {
            // Sjekk om det er hindringer mellom tårnet og målruten i raden
            val step = if (rowDiff > 0) 1 else -1
            var currentRow = row + step
            while (currentRow != newRow) {
                if (board[currentRow][col] != null) {
                    return false // Det er en hindring på veien
                }
                currentRow += step
            }
            // Målruten er enten tom eller inneholder en motstanders brikke
            return board[newRow][newCol] == null || board[newRow][newCol]!!.color != color
        }

        return false // Ugyldig trekk for tårnet
    }
}
