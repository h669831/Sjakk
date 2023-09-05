class King(color: String, row: Int, col: Int) : ChessPiece("King", color, row, col) {
    override fun isValidMove(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>): Boolean {
        val rowDiff = newRow - row
        val colDiff = newCol - col

        // Sjekk gyldige trekk for kongen basert på dens bevegelsesregler
        return Math.abs(rowDiff) <= 1 && Math.abs(colDiff) <= 1
    }
}
