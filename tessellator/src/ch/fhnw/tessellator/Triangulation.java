/*
 * Copyright (c) 2013 - 2016 Stefan Muller Arisona, Simon Schubiger
 * Copyright (c) 2013 - 2016 FHNW & ETH Zurich
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *  Neither the name of FHNW / ETH Zurich nor the names of its contributors may
 *   be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package ch.fhnw.tessellator;

import java.util.List;

import ch.fhnw.tessellator.glu.GLU;
import ch.fhnw.tessellator.glu.GLUtessellator;
import ch.fhnw.tessellator.glu.GLUtessellatorCallback;
import ch.fhnw.tessellator.glu.GLUtessellatorCallbackAdapter;

public final class Triangulation {
//	private static final int[] TRIANGLE = new int[] { 0, 1, 2 };
//
//	public static int[] triangulate(float[] polygon) {
//		if (polygon.length == 9)
//			return TRIANGLE;
//
//		final IntList result = new IntList(polygon.length * 2);
//
//		if (isConvex(polygon)) {
//			for (int i = 2; i < polygon.length / 3; i++) {
//				result.add(0);
//				result.add(i - 1);
//				result.add(i);
//			}
//			return result;
//		}
//
//		GLUtessellatorCallback callback = new GLUtessellatorCallbackAdapter() {
//			@Override
//			public void vertex(Object vertexData) {
//				if (vertexData instanceof Integer)
//					result.add((Integer) vertexData);
//			}
//
//			@Override
//			public void combine(double[] coords, Object[] data, float[] weight, Object[] outData) {
//				throw new IllegalArgumentException("combine not supported");
//			}
//		};
//
//		GLUtessellator tess = GLU.gluNewTess();
//		GLU.gluTessCallback(tess, GLU.GLU_TESS_VERTEX, callback);
//		GLU.gluTessCallback(tess, GLU.GLU_TESS_BEGIN, callback);
//		GLU.gluTessCallback(tess, GLU.GLU_TESS_EDGE_FLAG_DATA, callback);
//		GLU.gluTessCallback(tess, GLU.GLU_TESS_END, callback);
//
//		GLU.gluTessBeginPolygon(tess, null);
//		GLU.gluTessBeginContour(tess);
//		double[] tmp = new double[3];
//		for (int i = 0; i < polygon.length; i += 3) {
//			tmp[0] = polygon[i + 0];
//			tmp[1] = polygon[i + 1];
//			tmp[2] = polygon[i + 2];
//			GLU.gluTessVertex(tess, tmp, 0, i / 3);
//		}
//		GLU.gluTessEndContour(tess);
//		GLU.gluTessEndPolygon(tess);
//		GLU.gluDeleteTess(tess);
//
//		return result;
//	}
//
//	public static float[] triangulateAndExpand(float[] polygon) {
//		int[] t = triangulate(polygon);
//		float[] result = new float[t.length * 3];
//		int v = 0;
//		for (int i = 0; i < t.length; ++i) {
//			int j = t[i] * 3;
//			result[v++] = polygon[j];
//			result[v++] = polygon[j + 1];
//			result[v++] = polygon[j + 2];
//		}
//		return result;
//	}
//
//	public static boolean isConvex(float[] polygon) {
//		if (polygon.length < 9)
//			return false;
//		if (polygon.length == 9)
//			return true;
//
//		int n = polygon.length;
//		float d0x = polygon[n - 3] - polygon[n - 6];
//		float d0y = polygon[n - 2] - polygon[n - 5];
//		float d0z = polygon[n - 1] - polygon[n - 4];
//		float d1x = polygon[0] - polygon[n - 3];
//		float d1y = polygon[1] - polygon[n - 2];
//		float d1z = polygon[2] - polygon[n - 1];
//		float nx0 = d0y * d1z - d0z * d1y;
//		float ny0 = d0x * d1z - d0z * d1x;
//		float nz0 = d0x * d1y - d0y * d1x;
//
//		for (int i = 0; i < n - 3; i += 3) {
//			d0x = d1x;
//			d0y = d1y;
//			d0z = d1z;
//			d1x = polygon[i + 3] - polygon[i];
//			d1y = polygon[i + 4] - polygon[i + 1];
//			d1z = polygon[i + 5] - polygon[i + 2];
//			float nx1 = d0y * d1z - d0z * d1y;
//			float ny1 = d0z * d1x - d0x * d1z;
//			float nz1 = d0x * d1y - d0y * d1x;
//			if (nx0 * nx1 + ny0 * ny1 + nz0 * nz1 <= 0)
//				return false;
//		}
//		return true;
//	}
}
