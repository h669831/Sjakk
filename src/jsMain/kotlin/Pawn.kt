class Pawn(color: String, row: Int, col: Int) : ChessPiece("Pawn", color, row, col) {
    override fun isValidMove(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>): Boolean {
        val rowDiff = newRow - row
        val colDiff = newCol - col

        // Sjekk gyldige trekk for bonden basert på dens bevegelsesregler
        if (color == "white") {
            // Bonden beveger seg framover
            if (rowDiff == -1 && colDiff == 0 && board[newRow][newCol] == null) {
                return true
            }
            // Bonden slår diagonalt
            if (rowDiff == -1 && Math.abs(colDiff) == 1 && board[newRow][newCol] != null &&
                board[newRow][newCol]!!.color != color
            ) {
                return true
            }
            // Spesialtrekk: Bonden kan bevege seg to skritt på første trekk
            if (row == 6 && rowDiff == -2 && colDiff == 0 &&
                board[newRow][newCol] == null && board[row - 1][col] == null
            ) {
                return true
            }
        } else if (color == "black") {
            // Bonden beveger seg framover
            if (rowDiff == 1 && colDiff == 0 && board[newRow][newCol] == null) {
                return true
            }
            // Bonden slår diagonalt
            if (rowDiff == 1 && Math.abs(colDiff) == 1 && board[newRow][newCol] != null &&
                board[newRow][newCol]!!.color != color
            ) {
                return true
            }
            // Spesialtrekk: Bonden kan bevege seg to skritt på første trekk
            if (row == 1 && rowDiff == 2 && colDiff == 0 &&
                board[newRow][newCol] == null && board[row + 1][col] == null
            ) {
                return true
            }
        }

        return false // Ugyldig trekk for bonden
    }
}
