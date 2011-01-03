package tv.porst.swfretools.parser.tags;

import tv.porst.splib.io.BinaryParser;
import tv.porst.splib.io.BinaryParserHelpers;
import tv.porst.splib.io.UINT16;
import tv.porst.swfretools.parser.structures.RecordHeader;

public class DefineBitsParser {

	public static Tag parse(final RecordHeader header, final BinaryParser parser) {
		final UINT16 characterId = parser.readUInt16();
		final byte[] jpegData = BinaryParserHelpers.readByteArray(parser, header.getNormalizedLength());

		return new DefineBitsTag(header, characterId, jpegData);
	}

}
