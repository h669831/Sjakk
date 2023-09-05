class Bishop(color: String, row: Int, col: Int) : ChessPiece("Bishop", color, row, col) {
    override fun isValidMove(newRow: Int, newCol: Int, board: Array<Array<ChessPiece?>>): Boolean {
        val rowDiff = newRow - row
        val colDiff = newCol - col

        // Sjekk gyldige trekk for løperen basert på dens bevegelsesregler
        return rowDiff == colDiff || rowDiff == -colDiff
    }
}

