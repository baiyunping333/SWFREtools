package tv.porst.swfretools.parser.actions.as3;

import static tv.porst.swfretools.parser.SWFParserHelpers.parseUINT8;
import tv.porst.splib.binaryparser.UINT8;
import tv.porst.swfretools.parser.SWFBinaryParser;
import tv.porst.swfretools.parser.SWFParserException;
import tv.porst.swfretools.parser.structures.EncodedU30;
import tv.porst.swfretools.parser.structures.EncodedU30Parser;

public class AS3ConstructParser {

	public static AS3Construct parse(final SWFBinaryParser parser, final String fieldName) throws SWFParserException {

		final UINT8 opcode = parseUINT8(parser, 0x00006, fieldName + "::opcode");
		final EncodedU30 argCount = EncodedU30Parser.parse(parser, fieldName + "::arg_count");

		return new AS3Construct(opcode, argCount);
	}

}
