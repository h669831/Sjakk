class Knight(color: String, row: Int, col: Int) : ChessPiece("Knight", color, row, col) {
    override fun isValidMove(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>): Boolean {
        val rowDiff = newRow - row
        val colDiff = newCol - col

        // Sjekk gyldige trekk for springeren basert på dens bevegelsesregler
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)
    }
}