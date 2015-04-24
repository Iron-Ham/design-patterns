i/*
 * An instruction is the specific command that is generated by the game.
 * @author heshamsalman
 *
 */
public class Instruction {
	private InstructionStatus status;

	public Instruction(InstructionStatus status) {
		this.status = status;
	}

	public InstructionStatus getStatus() {
		return status;
	}

	public void setStatus(InstructionStatus status) {
		if (status != null && status != this.status) {
			this.status = status;
		}
	}
}
